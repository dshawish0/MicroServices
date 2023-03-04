package com.deiaa.temperaturerecordapi.controller;

import com.deiaa.temperaturerecordapi.model.UserLogin;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

@CrossOrigin(origins = "*", allowedHeaders = {"Content-Type", "Authorization"})
@RestController
@RequestMapping("/api/Auth")
public class AuthenticationController {

    @PostMapping
    public AtomicBoolean Authentication(@RequestBody UserLogin userLogin){
        AtomicBoolean auth= new AtomicBoolean(false);
        String  authUrl = "http://host.docker.internal:4040/Auth.json";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(authUrl))
                .build();

        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        response.thenApply(HttpResponse::body)
                .thenAccept(authJson -> {
                    if (authJson.contains(userLogin.getEmail()) && authJson.contains(userLogin.getPassword())) {
                        System.out.println("Redirecting to statistics page");
                        auth.set(true);
                    } else {
                        System.out.println(authJson);
                    }
                })
                .join();
        return auth;
    }
}

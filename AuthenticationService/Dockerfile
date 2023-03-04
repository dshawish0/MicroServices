FROM node:alpine as build

COPY Auth.json ./

FROM nginx:alpine
COPY default.conf /etc/nginx/conf.d/default.conf
RUN rm -rf /usr/share/nginx/html/*
COPY --from=build  ./  /usr/share/nginx/html

CMD ["nginx","-g","daemon off;"]
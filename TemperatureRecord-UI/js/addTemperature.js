$(function() {
    $('#temperature-form').submit(function(event) {
        event.preventDefault();
        const temperature = $('#temperature-input').val();
        const date = $('#date-input').val();
        const data = {
            temperature: temperature,
            date: date
        };
        fetch('http://localhost/api/temperature', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            })
            .then(response => {
                if (response.ok) {
                    alert('Temperature added successfully!');
                    window.location.href = "index.html";
                } else {
                    alert('Error adding temperature. Please try again.');
                }
            })
            .catch(error => {
                alert('Error adding temperature. Please try again.');
                console.error(error);
            });
    });
});
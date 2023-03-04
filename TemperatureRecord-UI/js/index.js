fetch('http://localhost/api/temperature')
    .then(response => response.json())
    .then(data => {

        const tbody = document.querySelector('#temperature-table tbody');


        data.forEach(item => {
            const tr = document.createElement('tr');
            const dateTd = document.createElement('td');
            const date = new Date(item.date).toLocaleDateString('en-US', {
                month: 'long',
                day: 'numeric',
                year: 'numeric'
            });
            dateTd.textContent = date;
            const tempTd = document.createElement('td');
            tempTd.textContent = item.temperature + " °C";
            tr.appendChild(dateTd);
            tr.appendChild(tempTd);
            tbody.appendChild(tr);
        });
    })
    .catch(error => console.error(error));
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Full screen</title>
<script
        src="https://code.jquery.com/jquery-2.2.4.js"
        integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
        crossorigin="anonymous"></script>
<link href="/resources/lib/fullcalendar/lib/main.css" rel="stylesheet" type="text/css">
<script src="/resources/lib/fullcalendar/lib/main.js"></script>
<script>
    /*
    document.addEventListener('DOMContentLoaded', function () {

        var calendarE1 = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarE1, {
            initialView: 'dayGridMonth'
        });
        calendar.render();

    });
    */
    $(document).ready(function() {

    	var calendarE1 = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarE1, {
            initialView: 'dayGridMonth',
            headerToolbar: {
                left: 'prev,next today',
                center: 'title',
                right: 'dayGridMonth'
            },
            displayEventTime: false,
            events: [
                {
                    id: 1,
                    title: "Good day.",
                    start: "2021-06-01",
                    end: "2021-06-03"
                },
                {
                    id: 2,
                    title: "Buy the way",
                    start: "2021-06-01",
                    end: "2021-06-05"
                },
                {
                    id: 3,
                    title : "Earn money",
                    start: "2021-06-03",
                    end: "2021-06-07"
                }
            ],
            eventClick: function (info) {
                console.log(info);
            }
        });
        calendar.render();

    });
</script>
</head>
<body>
<div id="calendar"></div>
</body>
</html>
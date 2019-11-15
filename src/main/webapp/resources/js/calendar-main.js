document.addEventListener('DOMContentLoaded', function () {
    const getEvent = () => {
        console.log('getEvent');
        $.ajax({
            url: '/calendar-exam',
            dataType: 'json',
            method: 'POST',
        })
    };


    const addBtnContainer = $('.modalBtnContainer-addEvent');
    const eventModal = $('#eventModal');
    const calendarEl = document.getElementById('calendar');

    const calendar = new FullCalendar.Calendar(calendarEl, {
        plugins: ['interaction', 'dayGrid', 'timeGrid'],
        selectable: true,
        editable: true,
        defaultView: 'dayGridMonth',
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'dayGridMonth,timeGridWeek,timeGridDay'
        },
        locale: 'ko',
        select: function (info) {
            addBtnContainer.show();
            eventModal.modal('show');
            console.log(info.startStr);
        },
        events: {
            url: '/calendar-exam',
            method : 'POST'
        },
        eventClick(arg) {
            console.log(arg.event);
        }
    });

    calendar.render();


});

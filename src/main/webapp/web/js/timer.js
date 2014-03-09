/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


setInterval(function() {
            var timer = $('#timer').html();
            timer = timer.split(':');
            var minutes = timer[0];
            var seconds = timer[1];
                if(seconds!="00" || minutes!="00"){
                    seconds -= 1;
                    if (minutes < 0) return;
                    if (seconds < 0 && minutes != 0) {
                        minutes -= 1;
                        seconds = 59;
                    }
                    else if (seconds < 10 && length.seconds != 2) seconds = '0' + seconds;
                    if ((minutes < 10) && ((minutes+'').length < 2)) minutes = '0' + minutes;
                    $('#timer').html(minutes + ':' + seconds);
                }
            }, 1000);
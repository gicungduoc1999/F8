

//=========================================//
/*/*         Apexcharts for admin          */
//=========================================//
function getData(){
    var val = document.getElementById('chart_val').c;
  return  Array.from(val);
}
try {

 
    var options1 = {
        series: [{
            name: 'Male',
            data: [480, 223, 256, 350, 410, 360, 260, 450, 480, 520, 530, 410]
        },
    {
            name: 'FeMale',
            data: [480, 223, 256, 350, 410, 360, 260, 450, 480, 520, 530, 410]
        }],
        chart: {
            type: 'bar',
            height: 350,
            toolbar: {
                show: false,
            },
        },
        grid: {
            borderColor: '#e9ecef',
        },
        plotOptions: {
            bar: {
                horizontal: false,
                columnWidth: '40%',
                endingShape: 'rounded'
            },
        },
        dataLabels: {
            enabled: false
        },
        stroke: {
            show: true,
            width: 2,
            colors: ['transparent']
        },
        colors: ['#396cf0','#53c797'],
        xaxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
        },
        yaxis: {
            title: {
                text: 'Patients',
    
                style: {
                    colors: ['#8492a6'],
                    fontSize: '13px',
                    fontFamily: 'Inter, sans-serif',
                    fontWeight: 500,
                },
            },
        },
        fill: {
            opacity: 1,
        },
        tooltip: {
            y: {
                formatter: function (val) {
                    return val + " Patients"
                }
            }
        }
    };
    
    var chart1 = new ApexCharts(document.querySelector("#dashboard"), options1);
    chart1.render();
} catch (error) {
    
}

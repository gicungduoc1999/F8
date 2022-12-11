<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Data Tables</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

        <script
            src="http://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" ></script>
    </head>
    <body>
        <div class="container">
            <h2>Slider List</h2>
            <table class="table table-fluid" id="myTable">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Back Link</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <tr><td>1</td><td>Socalmedia</td><td>Facebook</td></td><td>Draft</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>2</td><td>InterNet</td><td>Insta</td><td>Publish</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>3</td><td>Cartoon</td><td>Twitter</td><td>UnPublished</td><td><button>Edit<button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>4</td><td>Cinema</td><td>Telegram</td><td>Draft</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>5</td><td>sient</td><td>Facebook</td><td>Publish</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>6</td><td>Coach</td><td>Telegram</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>7</td><td>Kafy</td><td>Insta</td><td>UnPublished</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>8</td><td>Socalmedia</td><td>Facebook</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>9</td><td>Socalmedia</td><td>Facebook</td><td>Publish</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>10</td><td>Socalmedia</td><td>Telegram</td><td>UnPublished</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>11</td><td>Socalmedia</td><td>Facebook</td><td>Draft</td><td><button>Edit</button><button>Delete</button></td></tr>
                    <tr><td>12</td><td>Socalmedia</td><td>Facebook</td></td><td>Draft</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>13</td><td>InterNet</td><td>Insta</td><td>Publish</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>14</td><td>Socalmedia</td><td>Facebook</td></td><td>Draft</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                    <tr><td>15</td><td>InterNet</td><td>Insta</td><td>Publish</td><td><button>Edit</button><button style="margin-left: 10px">Delete</button></td></tr>
                </tbody>
            </table>
        </div>
        <script>
            $(document).ready(function () {
                $('#myTable').DataTable();
            });
        </script>
    </body>
</html>


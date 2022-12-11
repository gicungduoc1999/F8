
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Post Details</title>
        <!-- Bootstrap 5 CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <link href="css/postdetails.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="col-md-8 order-md-1">
            <h2>Post Details</h2>
            <form class="needs-validation" method="post">
                <div class="row">
                </div>

                <div class="mb-3">
                    <label for="username">Title</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">*</span>
                        </div>
                        <input type="text" id="inputTitle" class="form-control" placeholder="Input title" required value="${postdetail.title}">
                    </div>
                </div>

                <div class="mb-3">
                    <label for="email">Excerpt <span class="text-muted"></span></label>
                    <input type="email" id="inputExcerpt" class="form-control" id="email" placeholder="Input excerpt" value="${postdetail.excerpt}">
                </div>


                <!--                <div class="col-md-5 mb-3">
                                    <label for="country">Category</label>
                                    <select class="custom-select d-block w-100" id="country" required>
                                        <option value="">Choose...</option>
                                        <option>Study</option>
                                        <option>Tu add</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-4">
                                        <div class="custom-file">
                                            <label class="custom-file-label text-left" for="customFile">Choose image to upload</label>
                                            <input type="file" class="custom-file-input" id="customFile" multiple lang="ar" dir="rtl"">
                
                                        </div>
                                    </div>
                                    <script type="text/javascript">
                                        $('.custom-file input').change(function (e) {
                                            var files = [];
                                            for (var i = 0; i < $(this)[0].files.length; i++) {
                                                files.push($(this)[0].files[i].name);
                                            }
                                            $(this).next('.custom-file-label').html(files.join(', '));
                                        });
                                    </script>
                                </div>
                                <h4 class="mb-3">Status</h4>
                
                                <div class="d-block my-3">
                                    <div class="custom-control custom-radio">
                                        <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked required>
                                        <label class="custom-control-label" for="credit">Draft</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required>
                                        <label class="custom-control-label" for="debit">Published</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input" required>
                                        <label class="custom-control-label" for="paypal">UnPublished</label>
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <label for="author">Author</label>
                                    <input type="text" class="form-control" id="address" placeholder="Input author name" required>
                                </div>-->


                <div class="input-group">
                    <div class="left">
                        <div class="inputt">
                            <label for="country">Category</label>
                            <select class="custom-select d-block w-100" id="country" required>
                                <option value="" id="inputCategory">Choose...</option>
                                <option>Study</option>
                                <option>Tu add</option>
                            </select>
                        </div>
                        
                        <div class="inputt">
                            <label for="author">Author</label>
                            <input type="text" id="inputAuthor" class="form-control" id="address" placeholder="Input author name" required>
                        </div>
                    </div>
                    <div class="right">
                        <div class="inputt">
                            <label for="address">User avatar</label>
                            <div class="avatar"></div>
                            <input type="button" value="Change">
                        </div>
                    </div>
                </div>
                <div class="form-group form-inline">
                        <label class="control-label col-sm-3" style="text-align:left;" >Status:</label>
                        <div class="col-sm-6">	
                           <label class="radio-inline">
                             
                           <input type="radio" name="radio2" id="radio0" value="0"  onchange="" checked>Draft
                           </label>
                           <label class="radio-inline">
                           <input type="radio" name="radio2" id="radio1" value="200"  onchange="">Publish
                           </label>
                           <label class="radio-inline">
                           <input type="radio" name="radio2" id="radio2" value="300"  onchange="">UnPublished
                           </label>										
                        </div>
                        </div>


                <div class="mb-3">
                    <label for="tag">Tag</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">*</span>
                        </div>
                        <input type="text" id="inputTags"class="form-control" placeholder="Input tag" required  value="${postdetail.tags}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="content">Content</label>
                    <textarea
                        class="form-control"
                        id="inputContent"
                        placeholder="Write something...."
                        style="height: 200px"
                        >${postdetail.content}
                    </textarea>
                </div>

                <button class="btn btn-primary btn-lg btn-block" type="submit">Add</button>
                <button class="btn btn-primary btn-lg btn-block" type="submit">Update</button>
                <button class="btn btn-primary btn-lg btn-block" type="submit">Delete</button>

            </form>
        </div>
    </div>


    <!-- Bootstrap 5 JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>
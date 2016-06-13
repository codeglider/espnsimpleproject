$(function(){

    console.log("Welcome To ESPN Project");

    $("#espnSubmissionForm").submit(function(event){

        event.preventDefault();

        console.log("Form To Be Submitted");

        var form = $(this);
        /**
        To send XHR request we need to serialize the data from a form. Otherwise
        we will have to pick each input and create our own name/value pairs
        for submission.
        **/
        var formData = form.serialize();
        console.log("Data to be submitted")
        console.log(formData);

        $.ajax({
            type : "POST",
            url : "player/save",
            data : formData,
            beforeSend : function() {
                  console.log("Sending Request To Server")
            },
            success : function(data) {
                console.log("Getting Success Response Back From Server")
                console.log(data);

                var listObject = $("<li/>");
                listObject.append("<span>"+ data.id +"</span>");
                listObject.append("<span>"+ data.firstName +"</span>");
                listObject.append("<span>"+ data.lastName +"</span>");
                listObject.append("<span>"+ data.sport +"</span>");
                listObject.append("<span>"+ data.salary +"</span>");

                $("#playerDataList").append(listObject);

                //Reset The Form After Submission
                form.find("input[type=text]").val("");

            },
            error: function() {
              console.log("ERROR Occurred");
            }
        });


    });

});
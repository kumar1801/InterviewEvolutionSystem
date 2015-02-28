<script type="text/javascript">
    $(document).ready(function() {
        $('#signinform').formValidation({
            framework: 'bootstrap',
            icon: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                
                InterviewAssesmentReport: {
                      row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'Enter Interview Report is required'
                        },
                        
                        regexp: {
                            regexp: /^[A-z]+$/,
                            message: 'The Report can only consist of alphabets'
                        }
                    }
                },
                
                street: {
                    row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'The street is required'
                        }
                    }
                },
                  
                
                scheduleno: {
                    row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'Schedule no is required'
                        },
                        
                       regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'The field only consist of Numeric Value'
                        }
                    }
                },
                
              
                
         
            }
        });
    });
</script>
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
                
                roundstatus: {
                      row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'Round status is required'
                        },
                        
                        regexp: {
                            regexp: /^[A-z]+$/,
                            message: 'The Status can only consist of alphabets'
                        }
                    }
                },
                
                obtainedmarks: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Total marks are required'
                        },
                        
                       regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'The field only consist of Numeric Value'
                        }
                    }
                },
                
               passingcriteria: {
                    row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'Passing marks are required'
                            
                        },
                        
                       regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'The field only consist of Numeric Value'
                        }
                    }
                }
                
         
            }
        });
    });
</script>
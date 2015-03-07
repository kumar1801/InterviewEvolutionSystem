
<script>
$(document).ready(function() {
    $('#registrationform').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                row:'.col-sm-10',
                validators: {
                    notEmpty: {
                        message: 'The username is required'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: 'The username must be more than 6 and less than 30 characters long'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: 'The username can only consist of alphabetical, number and underscore'
                    }
                }
            },
            personid: {
                      row:'.col-lg-10',
                    validators: {
                        notEmpty: {
                            message: 'The ID is required'
                        },
                        stringLength: {
                            min: 3,
                            max: 6,
                            message: 'The ID must be more than 3 and less than 6 Number long'
                        },
                        regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'The ID only consist of Numeric Value'
                        }
                    }
                },
            
            contactno: {
                      row:'.col-sm-8',
                    validators: {
                        notEmpty: {
                            message: 'The Contact Number is required'
                        },
                        stringLength: {
                            min: 10,
                            max: 15,
                            message: 'The Contact must be more than 10 and less than 15 Number long'
                        },
                        regexp: {
                            regexp:/^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/,
                            message: 'The Contact Number only consist of Numeric Value'
                        }
                    }
                },
                 fname: {
                      row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'The firstname is required'
                        },
                        
                        regexp: {
                            regexp: /^[A-z]+$/,
                            message: 'The username can only consist of alphabets'
                        }
                    }
                },
                 mname: {
                      row:'.col-lg-3',
                    validators: {
                        notEmpty: {
                            message: 'The middlename is required'
                        },
                       
                        regexp: {
                            regexp: /^[A-z]+$/,
                            message: 'The username can only consist of alphabets'
                        }
                    }
                },
                lname: {
                      row:'.col-lg-3',
                    validators: {
                        notEmpty: {
                            message: 'The Last Name is required'
                        },
                        
                        regexp: {
                            regexp: /^[A-z]+$/,
                            message: 'The username can only consist of alphabets'
                        }
                    }
                },
            emailid: {
                      row:'.col-sm-10',
                    validators: {
                        notEmpty: {
                            message: 'The Email is required'
                        },
                        regexp: {
                            regexp:/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/,
                            message: 'The email-id can only consist alphabets, number and underscore'
                        }
                    }
                },
                 nationality: {
                    row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'The Nationality is required'
                        }
                    }
                },
                street: {
                    row:'.col-lg-4',
                    validators: {
                        notEmpty: {
                            message: 'The Street is required'
                        }
                    }
                },
                hobbies: {
                    row:'.col-sm-10',
                    validators: {
                        notEmpty: {
                            message: 'The Hobbies is required'
                        }
                    }
                },
            password: {
                     row:'.col-sm-10',
                    validators: {
                        notEmpty: {
                            message: 'The password is required'
                        },
                        stringLength: {
                            min: 5,
                            max: 15,
                            message: 'The Password must be more than 5 and less than 15 characters long'
                        }
                        
                    }
                },
                 confirmpassword: {
                     row:'.col-sm-10',
                    validators: {
                        notEmpty: {
                            message: 'The confirmpassword must match password'
                        },
                        stringLength: {
                            min: 5,
                            max: 15,
                            message: 'The Password must be more than 5 and less than 15 characters long'
                        }
                        
                    }
                }
                
                
        }
    });
});
</script>
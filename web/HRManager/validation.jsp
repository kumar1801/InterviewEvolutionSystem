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
                
                roundId: {
                      row:'.col-lg-12',
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
                
                  jobReferenceCode: {
                      row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The code is required'
                        },
                        stringLength: {
                            min: 3,
                            max: 6,
                            message: 'The Reference code must be more than 3 and less than 6 Number long'
                        },
                        regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'Code only consist of Numeric Value'
                        }
                    }
                },
                
                oldpassword: {
                      row:'.col-md-12',
                    validators: {
                        notEmpty: {
                            message: 'The password is required'
                        },
                       
                         regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: 'The password can only consist of alphabetical, number and underscore'
                    }
                    }
                },
                newpassword: {
                      row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The password is required'
                        },
                       
                         regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: 'The password can only consist of alphabetical, number and underscore'
                    }
                    }
                },
                desiredskilled: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The desired skills is required'
                        }
                    }
                },
                
                ctc: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The CTC is required'
                        },
                         regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'CTC only consist of Numeric Value'
                        }
                    }
                },
                vacancies: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The vacancies are required'
                        },
                       regexp: {
                            regexp:/^[0-9]+$/,
                            message: 'Code only consist of Numeric Value'
                        } 
                    }
                },
                 
                roundName: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'The Roundname is required'
                        }
                    }
                },
                 street: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Enter street is required'
                        }
                    }
                },
                 
                  zipcode: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Enter zipcode is required'
                        }
                    }
                },
                 
                  requiredQualification: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Enter Qualification is required'
                        }
                    }
                },
                 roundDescription: {
                    row:'.col-md-12',
                    validators: {
                        notEmpty: {
                            message: 'The round preference is required'
                        }
                    }
                },
                requiredDocuments: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Enter documents required'
                        }
                    }
                },
                
               
                totalMarks: {
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
                
                passingCriteria: {
                    row:'.col-lg-12',
                    validators: {
                        notEmpty: {
                            message: 'Passing marks are required'
                            
                        }
                        
                       
                    }
                },
                userImage:{
                    row:'col-lg-4',
                    validators:{
                        file:{
                            extension: 'doc,txt,pdf',
                            type:'application/msword ,application/pdf,text/plain,application/vnd.openxmlformats-officedocument.wordprocessingml.document' ,
                            maxSize:2097152,
                            message:'The selected File is not valid'
                        }
                                
                    }
                    
                }
                
         
            }
        });
    });
</script>
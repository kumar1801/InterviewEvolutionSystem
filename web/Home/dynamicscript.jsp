<SCRIPT lang="javascript">
        function addRow(tableID) 
        {
                var table = document.getElementById(tableID);

                var rowCount = table.rows.length;
                var row = table.insertRow(rowCount);
                var counts = rowCount - 1;

                var cell1 = row.insertCell(0);
                var orgname = document.createElement("input");
                orgname.type = "text";
                orgname.name = "orgname";
                orgname.className= "form-control";
                cell1.appendChild(orgname);

                var cell2 = row.insertCell(1);
                var responsibility = document.createElement("input");
                responsibility.type = "text";
                responsibility.name = "responsibility";
                responsibility.className="form-control";
                cell2.appendChild(responsibility);

                var cell3 = row.insertCell(2);
                var designation = document.createElement("input");
                designation.type = "text";
                designation.name = "designation";
                designation.className="form-control";
                cell3.appendChild(designation);

                var cell4 = row.insertCell(3);
                var duration = document.createElement("input");
                duration.type = "text";
                duration.name = "duration";
                duration.className="form-control";
                cell4.appendChild(duration);
                
                var cell5 = row.insertCell(4);
                var salaryDrawn = document.createElement("input");
                salaryDrawn.type = "text";
                salaryDrawn.name = "salaryDrawn";
                salaryDrawn.className= "form-control";
                cell5.appendChild(salaryDrawn);

        }
</SCRIPT>
<SCRIPT lang="javascript">
        function addRow1(tableID) 
        {
                var table = document.getElementById(tableID);

                var rowCount = table.rows.length;
                var row = table.insertRow(rowCount);
                var counts = rowCount - 1;
                
                var cell1 = row.insertCell(0);
                var degreetype = document.createElement("input");
                degreetype.type = "text";
                degreetype.name = "degreetype";
                degreetype.className = "form-control";
                
                cell1.appendChild(degreetype);

                var cell2 = row.insertCell(1);
                var institutionname = document.createElement("input");
                institutionname.type = "text";
                institutionname.name = "institutionname";
                institutionname.className= "form-control";
                cell2.appendChild(institutionname);

                var cell3 = row.insertCell(2);
                var yearofpassing = document.createElement("input");
                yearofpassing.type = "text";
                yearofpassing.name = "yearofpassing";
                yearofpassing.className="form-control";
                cell3.appendChild(yearofpassing);

                var cell4 = row.insertCell(3);
                var percentageobtained = document.createElement("input");
                percentageobtained.type = "text";
                percentageobtained.name = "percentageobtained";
                percentageobtained.className = "form-control";
                cell4.appendChild(percentageobtained);
                
                
        }
</SCRIPT>
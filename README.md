# Runners
första uppgiften
Test god för check av storlek
if (tid1 >= tid2)

	if (tid1 >= tid3)
        		{
             		max= tid1; 
	if (tid2 >= tid3) 
			min= tid3;
			mid= tid2;
        else 
			min= tid2;
			mid= tid3;
             		}
---------------------------------------------------------
 /*       else
            		{
            		max= tid3;
			mid= tid1; 
			min= tid2;
            		}
*/
----------------------------------------------------------        
	else if (tid2 >= tid3)
        		{
        		max= tid2; 
	if (tid1 >= tid3) 
			min= tid3; 
			mid= tid1;
	else 	
			min= tid1;
			mid= tid3;
    
			}
-----------------------------------------------------------        
	else
        		{
	        	max= tid3;
 
	if (tid1 >= tid2) 
			min= tid2;
			mid= tid1; 
	else 
			min= tid1;
			mid= tid2;
         		}

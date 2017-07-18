// JavaScript Document

<script language="javascript">  
    $(function() {  
        $("#intro").click(function() {  
            animate(".i", 'bounce');  
            return false;  
        });  
    });  
      
    function animate(element_ID, animation) {  
        $(element_ID).addClass(animation);  
        var wait = window.setTimeout( function(){  
            $(element_ID).removeClass(animation)}, 1300  
        );  
    }  
</script>  
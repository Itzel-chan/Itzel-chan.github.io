
window.onload = function() {
    const alertBox = document.getElementById('alertBox');
    

    setTimeout(function() {
      alertBox.classList.add('show'); 
    }, 500); 
    
  
    setTimeout(function() {
      alertBox.classList.remove('show');
    }, 3500); // 
  };
  
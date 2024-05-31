document.addEventListener('DOMContentLoaded', () => {
    // Your JavaScript code here
    console.log("NZeTA Application Portal Loaded");
});
document.addEventListener('DOMContentLoaded', function() {
    const menuToggle = document.querySelector('.menu-toggle');
    const navList = document.querySelector('nav ul');
  
    menuToggle.addEventListener('click', function() {
      navList.classList.toggle('open'); // Toggle the 'open' class on click
    });
  });
  
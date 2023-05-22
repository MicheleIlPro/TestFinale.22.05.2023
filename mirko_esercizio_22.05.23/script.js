const navLinks = document.querySelectorAll('.container nav a');
const pages = document.querySelectorAll('.container .page');

navLinks.forEach(link => {
  link.addEventListener('click', (e) => {
    e.preventDefault();
    const targetId = link.getAttribute('href');
    const targetPage = document.querySelector(targetId);

    navLinks.forEach(link => {
      if (link.classList.contains('active')) {
        link.classList.remove('active');
      }
    });

    pages.forEach(page => {
      if (page.classList.contains('active')) {
        page.classList.remove('active');
      }
    });

    link.classList.add('active');
    targetPage.classList.add('active');
  });
});
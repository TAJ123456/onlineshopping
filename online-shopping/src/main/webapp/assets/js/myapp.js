$(function(){
	
	// Solving the active menu problem
	switch(menu){
	
	case 'About Us':
		// fetching the jquery element using selector
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
		
	default:
		// fetching the jquery element using selector
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
		
	}	
});
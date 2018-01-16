(function() {
	'use strict';
	app.config(['$routeProvider',config]);
	
	function config($routeProvider){
		console.log('routeProvider');
		$routeProvider
			.when('/', {
				controller : 'HomeController as vm',
				templateUrl : 'app/partials/home.view.jsp'
			})
			.when('/billinfo', {
				templateUrl : 'app/partials/bill.view.jsp'
			})
	}
})();
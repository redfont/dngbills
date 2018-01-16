(function(){
	'use strict';
	app.controller('HomeController', ['$scope', '$http','$location', HomeController]);
	
	function HomeController($scope, $http, $location) {
		var vm = this;
		console.log('home'); 
		
		vm.serviceTypeCompanies = {};
		vm.test = test;
		
		console.log(vm.serviceTypeCompanies);
		init();
		
		function init() {
			$http({
				method:'GET',
				url:context + '/main/home/list',
				headers: {
					'Content-Type':'application/json'
				}
			}).then(
				function success(response){
					console.log(response.data);	
					vm.serviceTypeCompanies = response.data;
				},
				function error(response){
						
				}
			);
		}
		
		function test(){
			alert('test');
		}
	}
})();
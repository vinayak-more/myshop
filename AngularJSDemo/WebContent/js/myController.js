/**
 * @auther Vinayak More.
 * @date 01/12/2015
 */
var app = angular.module("myApp", []);
app.controller('myController', function($scope, $http) {
	$scope.dataFromController = 'Controller Testing 1 2 3';
	$scope.result = 'Controller working awesome...:-D';
	$scope.fullName = function() {
		return $scope.person.firstname + " " + $scope.person.lastname;
	};
	$http.get("http://www.w3schools.com/angular/customers.php").then(
			function(response) {
				$scope.names = response.data.records
			});
	$scope.count = 0;
	$scope.sortBy="Name";
});

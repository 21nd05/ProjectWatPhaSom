(function() {
  'use strict';

  angular
    .module('app')
    .config(routeConfig);

  function routeConfig($routeProvider) {
    $routeProvider
      .when('/index', {
        templateUrl: 'app/index/index.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .when('/listProduct', {
        templateUrl: 'app/product/category2.html',
        controller: 'listProductController',
        controllerAs: 'vm'
      })
      .otherwise({
        redirectTo: '/index'
      });
  }

})();

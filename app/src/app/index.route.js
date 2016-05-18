(function() {
  'use strict';

  angular
    .module('app')
    .config(routeConfig);

  function routeConfig($routeProvider) {
    $routeProvider
      .when('/index', {
        templateUrl: 'app/main/main.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .when('/product', {
        templateUrl: 'app/product/category1.html',
        controller: 'listProductController',
        controllerAs: 'vm'
      })
      .when('/addProduct',{
      templateUrl: 'app/product/editProduct.html',
      controller: 'addProductController',
      controllerAs: 'vm'
    })
      .when('/editProduct/:id',{
      templateUrl: 'app/product/editProduct.html',
      controller: 'editProductController',
      controllerAs: 'vm'
    })
      .when('/listProduct',{
      templateUrl: 'app/product/productList.html',
      controller: 'listProductController',
      controllerAs: 'vm'
    })
      .when('/shoppingCart/:id',{
      templateUrl: 'app/shoppingcart/shoppingCart.html',
      controller: 'showShoppingCartController',
      controllerAs: 'vm'
    })
      .when('/shoppingCart',{
      templateUrl: 'app/shoppingcart/shoppingCart.html',
      controller: 'shoppingCartController',
      controllerAs: 'vm'

    })
      .when('/productDetail/:id', {
      templateUrl: 'app/product/productDetail.html',
      controller: 'editProductController',
      controllerAs: 'vm'
    })
      .when('/userList',{
      templateUrl: 'app/user/userList.html',
      controller: 'listUserController',
      controllerAs: 'vm'
    })
<<<<<<< HEAD
      .when('/editRole/:id',{
=======
      .when('/editUser/:id',{
>>>>>>> master
        templateUrl: 'app/user/userDetail.html',
        controller: 'editUserController',
        controllerAs: 'vm'
      })
      .otherwise({
        redirectTo: '/index'
      });
  }

})();

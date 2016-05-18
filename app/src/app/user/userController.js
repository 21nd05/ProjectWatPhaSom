/**
 * Created by pan on 5/14/2016.
 */
(function () {
  'use strict';

  angular
    .module('app')
    .controller('listUserController', listUserController)
    .controller('registerController', registerController)
    .controller('editUserController', editUserController);

  /** @ngInject */
  function listUserController(userService, queryUserService) {
    var vm = this;
    vm.queryPromise = userService.query(function (data) {
      vm.users = data;
    }).$promise;

    vm.searchUser = function (name) {
      queryUserService.query({name: name}, function (data) {
        vm.users = data;
      });
    }

  }

  /** @ngInject */
  function registerController($http, $location, $rootScope, userService, $route) {
    var vm = this;
    vm.user = {};
    vm.addUser = true;
    vm.editUser = false;
    vm.register = function () {
      userService.save(vm.user, function () {
        $rootScope.addSuccess = true;
        $location.path("userList");
      });
    };

  }

  /** @ngInject */
<<<<<<< HEAD
  function editUserController($route, $routeParams, $location, $rootScope, userService, $http) {
    var vm = this;
=======
  function editUserController($http, $location, $rootScope, userService, $route,$routeParams) {
    var vm = this;
    vm.addPerson = false;
    vm.editPerson = true;
>>>>>>> master
    var id = $routeParams.id;
    userService.get({id: id},
      // success function
      function (data) {
        vm.user = data;
      }
    );

<<<<<<< HEAD
   /* vm.editProduct = function (flowFiles) {  //$http.put("/product", $scope.product).then(function () {
      productService.update({id: vm.product.id}, vm.product, function () {
        var productid = vm.product.id;
        // set location
        flowFiles.opts.target = 'http://localhost:8080/productImage/add';
        flowFiles.opts.testChunks = false;
        flowFiles.opts.query = {productid: productid};
        flowFiles.upload();

        $rootScope.editSuccess = true;
        $location.path("listProduct");
        $route.reload();
        vm.apply();
      });
    };*/
  }
=======
    vm.changeRole = function () {  //$http.put("/product", $scope.product).then(function () {
      userService.update({id: vm.user.id}, vm.user, function () {
        var userid = vm.user.id;
        $rootScope.editSuccess = true;
        $location.path("listUser");
        $route.reload();
        vm.apply();
      });
    };

  };

>>>>>>> master
})();



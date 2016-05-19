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
        $location.path("index");
      });
    };

  }

  /** @ngInject */
  function editUserController($route, $routeParams, $location, $rootScope, userService, $http) {
    var vm = this;
    var id = $routeParams.id;
    userService.get({id: id},
      // success function
      function (data) {
        vm.user = data;
      }
    );

    vm.changeRole = function () {  //$http.put("/product", $scope.product).then(function () {
      userService.update({id: vm.user.id}, vm.user, function () {
        var userid = vm.user.id;
        $rootScope.editSuccess = true;
        $location.path("userList");
        $route.reload();
        vm.apply();
      });
    };
  }

})();



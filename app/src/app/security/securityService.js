(function () {
  'use strict'
  angular
    .module('app')
    .factory('UserService', UserService)

  /** @ngInject */
  function UserService($resource) {
    return $resource('http://localhost:8080/user/:action', {},
      {
        authenticate: {
          method: 'POST',
          params: {'action': 'authenticate'},
          header: {'Content-Type': 'application/x-www-form-urlencoded'}
        }
      })
  }


})();

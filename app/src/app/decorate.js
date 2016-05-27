(function(){
  'use strict';

  var API_PREFIX = 'http://watphasomshop.cloudapp.net:8080/watphasom';
  /** @ngInject */
  angular.module('ngResource+apiPrefix', [
    'ngResource'
  ]).decorate('$resource', function ($delegate) {

    return function decoratedResource() {
      arguments[0] = API_PREFIX + arguments[0];
      return $delegate.apply(this, arguments);
    };

  });
})();

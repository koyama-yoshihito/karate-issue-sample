function fn() {
    var config = {
        authorizationHeader: 'Bearer ' + 'dummy'
    }
    var result = karate.callSingle('classpath:com/karateexample/karate/util/fetchToken.feature', config);
    config.authorizationHeader = 'Bearer ' + result.token
    var LM = Java.type('com.karateexample.karate.headers.LogModifier');
    karate.configure('logModifier', new LM);
    return config;
}

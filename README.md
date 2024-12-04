# Cordova-plugin-hello

This is a simple cordova plugin written in swift and kotlin. You can use this by adding the plugin to your app and calling any of the following methods:

```javascript
cordova.plugins.HelloWorld.coolMethod(
  "Hi there",
  function (success) {
    console.log(success);
  },
  function (error) {
    console.error(error);
  }
);

// or

cordova.plugins.HelloWorld.sayHello(
  function (success) {
    console.log(success);
  },
  function (error) {
    console.error(error);
  }
);
```

You can also use this repo as a starting point to create your own cordova plugin. Just clone the repo, rename some files and you can start writing your own plugin.

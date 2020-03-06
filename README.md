# Checklist
Handling asynchronous calls made easy 

1. Create a checklist object

```java
Checklist mChecklist = new Checklist();
```
2. Add an action and make your async calls

```java
mChecklist.addAction(new Action(mChecklist){
   @Override
      public void addAction() {
          exampleAsyncCallOne(new asyncCallback() {
              @Override
              public void onCallback(ResponseObject responseObject) {
                  putInBundle("callOne",responseObject); //Any data to be saved can be added to the bundle with a key
                  completed(); // Call this method once the async task is completed
              }
          });
      }
}
```
Add as many actions as you want
```java
mChecklist.addAction(new Action(mChecklist){
   @Override
      public void addAction() {
          exampleAsyncCallTwo(new asyncCallback() {
              @Override
              public voi onCallback(ResponseObject responseObject) {
                  putInBundle("callTwo",responseObject); //Any data to be saved can be added to the bundle with a key
                  completed(); // Call this method once the async task is completed
              }
          });
      }
}
```

3. After adding the actions add a ChecklistCompletedListener
```java
mChecklist.addChecklistCompletedListener(new ChecklistCompletedListener() {
          @Override
          public void OnChecklistCompleter(ActionBundle actionBundle) {

              ResponseObject callOneObject = actionBundle.get("callOne"); //Get response objects from the bundle
              ResponseObject callTwoObject = actionBundle.get("callTwo");

          }
      });
```

4. Don't forget to call the start() method to start the actions
```java
mChecklist.start();
```

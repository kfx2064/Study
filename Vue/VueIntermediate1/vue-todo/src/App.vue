<template>
  <div id="app">
    <TodoHeader></TodoHeader>
    <TodoInput v-on:addTodoItem="addOneItem"></TodoInput>
    <TodoList v-bind:propsdata="todoItems"></TodoList>
    <TodoFooter></TodoFooter>
  </div>
</template>

<script>
import TodoHeader from './components/TodoHeader.vue'
import TodoInput from './components/TodoInput.vue'
import TodoList from './components/TodoList.vue'
import TodoFooter from './components/TodoFooter.vue'

export default {
  data: function() {
    return {
      todoItems: []
    }
  },
  methods: {
    addOneItem: function(todoItem) {
      var obj = {completed: false, item: todoItem};
      localStorage.setItem(todoItem, JSON.stringify(obj)); 
      this.todoItems.push(obj);
    }
  },
  created: function() {
    if (localStorage.length > 0) {
       for (var i = 0; i < localStorage.length; i++) {
         if (localStorage.key(i) !== 'loglevel:webpack-dev-server') {
           console.log(localStorage.getItem(localStorage.key(i)));
           var getJsonData = JSON.parse(localStorage.getItem(localStorage.key(i)));
           console.log(getJsonData);
           this.todoItems.push(getJsonData);
           //console.log(JSON.parse(localStorage.getItem(localStorage.key(i))));
           //this.todoItems.push(JSON.parse(localStorage.getItem(localStorage.key(i))));
         }
       }
    }
  },
  components: {
     'TodoHeader' : TodoHeader, 
     'TodoInput' : TodoInput, 
     'TodoList' : TodoList, 
     'TodoFooter' : TodoFooter,  
  }
}
</script>

<style>
body {
  text-align: center;
  background-color: #F6F6F6;
}
input {
  border-style: groove;
  width: 200px;
}
button {
  border-style: groove;
}
.shadow {
  box-shadow: 5px 10px 10px rgba(0, 0, 0, 0.03);
}
</style>
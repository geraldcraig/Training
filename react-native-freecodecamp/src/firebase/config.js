import * as firebase from 'firebase';
import '@firebase/auth';
import '@firebase/firestore';

const firebaseConfig = {
    apiKey: "AIzaSyC1U9c2cvoLF7FedYka_ZzeMBAzH1mfUSM",
    authDomain: "react-native-freecodecamp.firebaseapp.com",
    databaseURL: 'https://react-native-freecodecamp-default-rtdb.firebaseio.com/',
    projectId: "react-native-freecodecamp",
    storageBucket: "react-native-freecodecamp.appspot.com",
    messagingSenderId: "793264804101",
    appId: "1:793264804101:web:c440beb63a70dd087e276c"
  };

if (!firebase.apps.length) {
    firebase.initializeApp(firebaseConfig);
}

export { firebase };
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";

export const getFirebaseApp = () => {
  // TODO: Add SDKs for Firebase products that you want to use
  // https://firebase.google.com/docs/web/setup#available-libraries

  // Your web app's Firebase configuration
  // For Firebase JS SDK v7.20.0 and later, measurementId is optional
  const firebaseConfig = {
    apiKey: "AIzaSyCrwfj1MNWKUzJuSESJ-ZRgKj6p4fxHg6Y",
    authDomain: "whatsapp-2bb0b.firebaseapp.com",
    projectId: "whatsapp-2bb0b",
    storageBucket: "whatsapp-2bb0b.appspot.com",
    messagingSenderId: "748643605670",
    appId: "1:748643605670:web:4f54cf6b2afb48e4e8e867",
    measurementId: "G-4VZF9BR7M8",
  };

  // Initialize Firebase
  return initializeApp(firebaseConfig);
};

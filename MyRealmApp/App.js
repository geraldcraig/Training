/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import { SafeAreaView } from 'react-native';

import BookStore from './src';

const App = () => {
    return (
    <SafeAreaView style={{flex:1}}>
        <BookStore />
    </SafeAreaView>
    );
}

export default App;

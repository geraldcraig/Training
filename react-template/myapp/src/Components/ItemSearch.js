import React, {useState} from "react";
import {Container, Row, Form, Card, Button, Table} from 'react-bootstrap';
import * as events from "events";

function ItemSearch() {
    const [name, setName] = useState('');
    const [itemsByName, setItemsByName] = useState([]);
    const [searched, setSearched] = useState(false);
    var [itemsFound, setItemsFound] = useState(false);
    const handleSearch = async (event) => {
        event.preventDefault();
        try {
            const response = await fetch(`/api/items`)
                .then(response => response.json())
                .then(data => setItemsByName(data));
            if (response.data.length > 0) {
                setSearched(true);
                setItemsFound(true);
            } else {
                setSearched(true);
                setItemsFound(false);
            }
        } catch
            (error) {
            console.error(error);
        }
    };
    return (
        <>
        </>
    );
}

export default ItemSearch;
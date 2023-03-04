import React, { useState, useEffect } from "react";
import Form from './Form';
import { Container, Row, Button, Card } from 'react-bootstrap';


function List() {
    const [item, setItem] = useState([]);
    const [editing, setEditing] useState(false);
    return (
        <h1>List</h1>
    );
};

export default List;
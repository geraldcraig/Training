import React from 'react';

import classes from './Album.module.css';

const Album = (props) => {
  return (
    <li className={classes.album}>
      <h4>{props.title}</h4>
      <h4>{props.name}</h4>
      <p>{props.image}</p>
    </li>
  );
}

export default Album;
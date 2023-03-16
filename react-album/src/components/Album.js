import React from 'react';

import classes from './Album.module.css';

const Album = (props) => {
  return (
    <li className={classes.album}>
      <h2>{props.title}</h2>
      {/* <h3>{props.name}</h3>
      <p>{props.year}</p> */}
    </li>
  );
}

export default Album;
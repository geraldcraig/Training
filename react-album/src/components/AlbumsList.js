import React from 'react';

import Album from './Album';
import classes from './AlbumsList.module.css';

const AlbumsList = (props) => {
  return (
    <ul className={classes['albums-list']}>
      {props.albums.map((album) => (
        <Album
          key={album.id}
          title={album.title}
          // name={album.name}
          // year={album.year}
        />
      ))}
    </ul>
  );
}

export default AlbumsList;
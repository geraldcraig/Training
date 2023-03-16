import React, { useState } from 'react';

import AlbumsList from './components/AlbumsList';
import './App.css';

function App() {
  const [albums, setAlbums] = useState([]);

  function fetchAlbumsHandler() {
    fetch('http://gcraig15.webhosting6.eeecs.qub.ac.uk/albumsapi/api.php?topten').then(response => {
        return response.json();
    }).then(data => {
        const transformedAlbums = data.results.map(albumData => {
          return {
            id: albumData.id,
            title: albumData.title
            // name: albumData.name,
            // year: albumData.year
          };
        });
        setAlbums(transformedAlbums);
    });
  }

  return (
    <React.Fragment>
      <section>
        <button onClick={fetchAlbumsHandler}>Fetch Albums</button>
      </section>
      <section>
        <AlbumsList albums={albums} />
      </section>
    </React.Fragment>
  );
}

export default App;
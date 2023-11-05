import { FlatList } from "react-native";
import FeedPost from "../components/FeedPost";
import posts from "../../assets/data/posts.json";
import { useEffect, useState } from "react";
import { DataStore } from '@aws-amplify/datastore';
import { Post } from '../models';

const [posts, setPosts] = useState([]);

useEffect(() => {
  DataStore.query(Post).then(setPosts);
}, []);

const FeedScreen = () => {
  return (
    <FlatList
      data={posts}
      renderItem={({ item }) => <FeedPost post={item} />}
      showsVerticalScrollIndicator={false}
    />
  );
};

export default FeedScreen;
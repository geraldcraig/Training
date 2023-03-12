import Modal from './Modal';
import NewPost from './NewPost';
import Post from './Post';
import classes from './PostsList.module.css';

function PostsList({isPosting, onStopPosting}) {
    return ( 
        <>
            {isPosting ? (
            <Modal onClose={onStopPosting}>
                <NewPost onCancel={onStopPosting} />
            </Modal>
            ) : false}
            <ul className={classes.posts}>
                <Post author="Manuel" body="Check out the full course!"/>
            </ul>
        </>
    );
}

export default PostsList;
# Third-arty imports...
from nose.tools import assert_is_not_none

# Local imports...
from mock-api.services import get_todos


def test_request_response():
    # Call the service, which will send a request to the server.
    response = get_todos()

    # Confirm that the request-response cycle completed successfully.
    assert_is_not_none(response)
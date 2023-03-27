db.createUser(
    {
        user: "admin",
        pwd: "password",
        roles: [
            {
                role: "readwrite",
                db: "firstdb"
            }
        ]
    }
)
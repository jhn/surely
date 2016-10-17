-- name: save-photo!
-- creates a new user record
INSERT INTO photos
(name, description, timestamp)
VALUES (:name, :description, :timestamp)

-- name: get-photos
-- gets all photos
SELECT * FROM photos

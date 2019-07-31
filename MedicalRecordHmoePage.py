from flask_sqlalchemy import SQLAlchemy
from werkzeug.security import generate_password_hash, check_password_hash

db = SQLAlchemy()

class MRhomepage(db.Model):
    __tablename__ = 'mr_homepage'
    id = db.Column(db.Integer,primary_key=True)
    name = db.Column(db.String(255),unique=True)
    id_number = db.Column(db.VARCHAR(255),unique=True)
    telephone = db.Column(db.VARCHAR(255),unique=True)
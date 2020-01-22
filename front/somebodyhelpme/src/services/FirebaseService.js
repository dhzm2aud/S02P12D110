import firebase from 'firebase/app'
import 'firebase/firestore'
import 'firebase/auth'

const Member = 'member'

// Setup Firebase
// Do change to your own firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyBiRsQ6uDCSE7ZNUBXvIRg0Xh4urQ5EeU8",
    authDomain: "somb0dy.firebaseapp.com",
    databaseURL: "https://somb0dy.firebaseio.com",
    projectId: "somb0dy",
    storageBucket: "somb0dy.appspot.com",
    messagingSenderId: "951226574937",
    appId: "1:951226574937:web:759037c828de80880a2948",
    measurementId: "G-QYHZCW9RFH"
}
firebase.initializeApp(firebaseConfig)

const firestore = firebase.firestore()

export default {
	getDatas() {
		const membersCollection = firestore.collection(Member)
		return membersCollection
			.get()
			.then((docSnapshots) => {
				return docSnapshots.docs.map((doc) => {
					let data = doc.data()
					return data
				})
			})
	},
}
import firebase from 'firebase/app'
import 'firebase/firestore'
import 'firebase/auth'

const Members = 'members'

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
		return firestore.collection(Members)
			.get()
			.then((docSnapshots) => {
				return docSnapshots.docs.map((doc) => {
					let data = doc.data()
					return data
				})
			})
	},
	getData(id) {
		console.log('read one data')
		return firestore.collection(Members).doc(id)
		.get()
		.then((docSnapshots) => {
			return docSnapshots.data()
		})
	},
	postDatas(email, phone) {
		console.log("여기당"+email+phone)
		return firestore.collection(Members).doc(email).set({
			phone: phone
		})
	},
	putDatas(id) {
		console.log('update')
		firestore.collection(Members).doc(id).set({
			members_id: 'test2'
		})
	},
	delDatas() {
		console.log('delete')
		firestore.collection(Members).doc('LFHwR5zEK53I9sfaKrcr').delete()
	},
	logInEmail(email, password, phone) {
		firebase.auth().createUserWithEmailAndPassword(email, password).then(function(result) {
			console.log(phone)
			firestore.collection(Members).doc(email).set({
				phone: phone
			})
			return result
		}).catch(function(error) {
			console.error('[Login Error]', error)
		})
	},
	loginWithGoogle(phone) {
		let provider = new firebase.auth.GoogleAuthProvider()
		return firebase.auth().signInWithPopup(provider).then(function(result) {
			let accessToken = result.credential.accessToken
			console.log(accessToken)
			let user = result.user
			console.log(user)
			console.log(user.email)
			firestore.collection(Members).doc(user.email).set({
				phone: phone
			})
			return result
		}).catch(function(error) {
			console.error('[Google Login Error]', error)
		})
	},
	logout() {
		firebase.auth().signOut().then(function() {
			console.log("Sign-out successful.")
		}).catch(function(error) {
			console.error('[Logout Error]', error)
		})
	}
	
}

firebase.auth().onAuthStateChanged(function(user) {
	if (user) {
		console.log(user)
	} else {
		console.log("not login")
	}
  });
  
  
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
	postDatas() {
		console.log('add')
		return firestore.collection(Members).add({
			members_id: 'test1',
			password: '1234',
			email: 'test1@naver.com'
		})
	},
	putDatas() {
		console.log('update')
		firestore.collection(Members).doc('LFHwR5zEK53I9sfaKrcr').set({
			members_id: 'test2'
		})
	},
	delDatas() {
		console.log('delete')
		firestore.collection(Members).doc('LFHwR5zEK53I9sfaKrcr').delete()
	}
	
}
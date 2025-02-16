package com.example.firstlessonapp.viewmodel


//@HiltViewModel
//class UserViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
////    private var _users = mutableStateOf<List<User>>(emptyList())
////    val users: State<List<User>> = _users
//    private val _numberFlow = MutableStateFlow(0)
//    val numberFlow: StateFlow<Int> = _numberFlow.asStateFlow()
//
////    init {
////        getUser()
////    }
//
//    fun incNumberFlow() {
//        _numberFlow.value += 1
//    }
//
////    private fun getUser() {
////        viewModelScope.launch {
////            _users.value = userRepository.getUser()
////        }
////    }
//}

//class NumberViewModel () : ViewModel() {
//    private val _numberFlow = MutableStateFlow(0)
//    val numberFlow: StateFlow<Int> = _numberFlow.asStateFlow()
//    fun incNumberFlow() {
//        _numberFlow.value += 1
//    }
//}
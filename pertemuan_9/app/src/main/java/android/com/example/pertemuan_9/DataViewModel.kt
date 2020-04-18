package android.com.example.pertemuan_9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    val liveData = MutableLiveData<Result>()

    fun setHitung(Alas: String, Tinggi: String): LiveData<Result> {
        val a = Alas.toDouble()
        val t = Tinggi.toDouble()
        val tampung = 0.5 * a * t
        val result = Result(tampung.toString())
        liveData.postValue(result)
        return liveData
    }

    fun getHitung(): LiveData<Result> {
        return liveData
    }
}
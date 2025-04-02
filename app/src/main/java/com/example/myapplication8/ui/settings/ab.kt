//package com.example.myapplication8.ui.settings
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.ViewModelProvider
//import com.example.myapplication8.databinding.FragmentSettingsBinding
//
//class ab : Fragment() {
//
//    private var _binding: FragmentSettingsBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//
//
////    定义了一个可空的 _binding 变量，用于保存 Fragment 的绑定对象。
////    定义了一个只读属性 binding，通过非空断言 (!!) 获取 _binding 的值，确保在 onCreateView 和 onDestroyView 生命周期内有效。
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
////        容器ViewGroup
//        savedInstanceState: Bundle?
////        保存的状态Bundle。
//    ): View {
//        val settingsViewModel =
//            ViewModelProvider(this).get(SettingsViewModel::class.java)
//
//        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textSettings
//        settingsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//            settingsViewModel.text.observe(viewLifecycleOwner) { text ->
//                val spannableString = SpannableString(text)
//
//                // 假设文本以 "|" 分隔不同段落
//                val paragraphs = text.split("|")
//
//                var startIndex = 0
//                paragraphs.forEach { paragraph ->
//                    val endIndex = startIndex + paragraph.length
//
//                    // 第一段文字设置为粗体
//                    if (paragraphs.indexOf(paragraph) == 0) {
//                        spannableString.setSpan(StyleSpan(Typeface.BOLD), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//                    }
//
//                    // 第二段文字设置为斜体
//                    if (paragraphs.indexOf(paragraph) == 1) {
//                        spannableString.setSpan(StyleSpan(Typeface.ITALIC), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//                    }
//
//                    // 第三段文字设置为红色
//                    if (paragraphs.indexOf(paragraph) == 2) {
//                        spannableString.setSpan(ForegroundColorSpan(Color.RED), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
//                    }
//
//                    startIndex = endIndex + 1 // 跳过分隔符
//                }
//
//                textView.text = spannableString
//            }
//            return root
//        }
//
//
////    这段代码是一个Kotlin中的onCreateView方法实现，主要用于初始化Fragment的UI和绑定ViewModel数据。功能分解如下：
////    创建SettingsViewModel实例，用于管理设置相关的数据。
////    使用FragmentSettingsBinding绑定布局文件，生成视图对象root。
////    观察settingsViewModel.text的变化，并将更新后的文本内容设置到TextView中。
////    返回生成的视图root供Fragment使用。
//
//        override fun onDestroyView() {
//            super.onDestroyView()
//            _binding = null
//        }
//    }
//
////
////在这里，代码使用了Fragment而不是Compose来构建视图，主要原因可能包括以下几点：
////
////1. **项目迁移或兼容性**：如果项目最初是基于传统的View系统开发的，后续新增功能可能会继续沿用Fragment和XML布局，以保持一致性并减少重构成本。
////2. **复杂生命周期管理**：Fragment提供了更复杂的生命周期管理，适合需要精细控制场景的应用。而此处的代码通过`onCreateView`和`onDestroyView`明确管理了绑定对象 `_binding` 的生命周期。
////3. **工具和库的支持**：传统Fragment与许多现有库（如ViewModel、LiveData）有良好的集成支持，而Compose在某些场景下的生态支持可能尚未完全成熟。
////4. **开发者习惯**：团队可能更熟悉传统的View系统，选择Fragment可以更快地上手开发。
////
////如果改用Compose，虽然能简化布局声明和提升性能，但需要重构现有代码，并且可能引入额外的学习成本。因此，在没有明确需求推动的情况下，继续使用Fragment是一种合理的选择。
